
/* First created by JCasGen Fri Jul 10 09:16:06 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Argument
 * Updated by JCasGen Fri Jul 10 09:16:06 CEST 2026
 * @generated */
public class Argument_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Argument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Argument");
 
  /** @generated */
  final Feature casFeat_topic;
  /** @generated */
  final int     casFeatCode_topic;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTopic(int addr) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.Argument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_topic);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopic(int addr, String v) {
        if (featOkTst && casFeat_topic == null)
      jcas.throwFeatMissing("topic", "org.texttechnologylab.annotation.Argument");
    ll_cas.ll_setStringValue(addr, casFeatCode_topic, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Arguments;
  /** @generated */
  final int     casFeatCode_Arguments;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getArguments(int addr) {
        if (featOkTst && casFeat_Arguments == null)
      jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Arguments);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setArguments(int addr, int v) {
        if (featOkTst && casFeat_Arguments == null)
      jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    ll_cas.ll_setRefValue(addr, casFeatCode_Arguments, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getArguments(int addr, int i) {
        if (featOkTst && casFeat_Arguments == null)
      jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Arguments), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Arguments), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Arguments), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setArguments(int addr, int i, int v) {
        if (featOkTst && casFeat_Arguments == null)
      jcas.throwFeatMissing("Arguments", "org.texttechnologylab.annotation.Argument");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Arguments), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Arguments), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Arguments), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_reason;
  /** @generated */
  final int     casFeatCode_reason;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getReason(int addr) {
        if (featOkTst && casFeat_reason == null)
      jcas.throwFeatMissing("reason", "org.texttechnologylab.annotation.Argument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_reason);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setReason(int addr, String v) {
        if (featOkTst && casFeat_reason == null)
      jcas.throwFeatMissing("reason", "org.texttechnologylab.annotation.Argument");
    ll_cas.ll_setStringValue(addr, casFeatCode_reason, v);}
    
  
 
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
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Argument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_model);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setModel(int addr, int v) {
        if (featOkTst && casFeat_model == null)
      jcas.throwFeatMissing("model", "org.texttechnologylab.annotation.Argument");
    ll_cas.ll_setRefValue(addr, casFeatCode_model, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Argument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_topic = jcas.getRequiredFeatureDE(casType, "topic", "uima.cas.String", featOkTst);
    casFeatCode_topic  = (null == casFeat_topic) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_topic).getCode();

 
    casFeat_Arguments = jcas.getRequiredFeatureDE(casType, "Arguments", "uima.cas.FSArray", featOkTst);
    casFeatCode_Arguments  = (null == casFeat_Arguments) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Arguments).getCode();

 
    casFeat_reason = jcas.getRequiredFeatureDE(casType, "reason", "uima.cas.String", featOkTst);
    casFeatCode_reason  = (null == casFeat_reason) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_reason).getCode();

 
    casFeat_model = jcas.getRequiredFeatureDE(casType, "model", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_model  = (null == casFeat_model) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_model).getCode();

  }
}



    