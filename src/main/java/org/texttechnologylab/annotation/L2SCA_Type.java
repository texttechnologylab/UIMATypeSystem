
/* First created by JCasGen Fri Jul 10 09:22:49 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** L2SCA Output
 * Updated by JCasGen Fri Jul 10 09:22:49 CEST 2026
 * @generated */
public class L2SCA_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = L2SCA.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.L2SCA");
 
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
      jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Value);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setValue(int addr, double v) {
        if (featOkTst && casFeat_Value == null)
      jcas.throwFeatMissing("Value", "org.texttechnologylab.annotation.L2SCA");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Value, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Code;
  /** @generated */
  final int     casFeatCode_Code;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCode(int addr) {
        if (featOkTst && casFeat_Code == null)
      jcas.throwFeatMissing("Code", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Code);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCode(int addr, String v) {
        if (featOkTst && casFeat_Code == null)
      jcas.throwFeatMissing("Code", "org.texttechnologylab.annotation.L2SCA");
    ll_cas.ll_setStringValue(addr, casFeatCode_Code, v);}
    
  
 
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
      jcas.throwFeatMissing("typeName", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getStringValue(addr, casFeatCode_typeName);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTypeName(int addr, String v) {
        if (featOkTst && casFeat_typeName == null)
      jcas.throwFeatMissing("typeName", "org.texttechnologylab.annotation.L2SCA");
    ll_cas.ll_setStringValue(addr, casFeatCode_typeName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_typeNumber;
  /** @generated */
  final int     casFeatCode_typeNumber;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTypeNumber(int addr) {
        if (featOkTst && casFeat_typeNumber == null)
      jcas.throwFeatMissing("typeNumber", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getIntValue(addr, casFeatCode_typeNumber);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTypeNumber(int addr, int v) {
        if (featOkTst && casFeat_typeNumber == null)
      jcas.throwFeatMissing("typeNumber", "org.texttechnologylab.annotation.L2SCA");
    ll_cas.ll_setIntValue(addr, casFeatCode_typeNumber, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Measure;
  /** @generated */
  final int     casFeatCode_Measure;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMeasure(int addr) {
        if (featOkTst && casFeat_Measure == null)
      jcas.throwFeatMissing("Measure", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Measure);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMeasure(int addr, String v) {
        if (featOkTst && casFeat_Measure == null)
      jcas.throwFeatMissing("Measure", "org.texttechnologylab.annotation.L2SCA");
    ll_cas.ll_setStringValue(addr, casFeatCode_Measure, v);}
    
  
 
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
      jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getStringValue(addr, casFeatCode_definition);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDefinition(int addr, String v) {
        if (featOkTst && casFeat_definition == null)
      jcas.throwFeatMissing("definition", "org.texttechnologylab.annotation.L2SCA");
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.L2SCA");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.L2SCA");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public L2SCA_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Value = jcas.getRequiredFeatureDE(casType, "Value", "uima.cas.Double", featOkTst);
    casFeatCode_Value  = (null == casFeat_Value) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Value).getCode();

 
    casFeat_Code = jcas.getRequiredFeatureDE(casType, "Code", "uima.cas.String", featOkTst);
    casFeatCode_Code  = (null == casFeat_Code) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Code).getCode();

 
    casFeat_typeName = jcas.getRequiredFeatureDE(casType, "typeName", "uima.cas.String", featOkTst);
    casFeatCode_typeName  = (null == casFeat_typeName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_typeName).getCode();

 
    casFeat_typeNumber = jcas.getRequiredFeatureDE(casType, "typeNumber", "uima.cas.Integer", featOkTst);
    casFeatCode_typeNumber  = (null == casFeat_typeNumber) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_typeNumber).getCode();

 
    casFeat_Measure = jcas.getRequiredFeatureDE(casType, "Measure", "uima.cas.String", featOkTst);
    casFeatCode_Measure  = (null == casFeat_Measure) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Measure).getCode();

 
    casFeat_definition = jcas.getRequiredFeatureDE(casType, "definition", "uima.cas.String", featOkTst);
    casFeatCode_definition  = (null == casFeat_definition) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_definition).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    