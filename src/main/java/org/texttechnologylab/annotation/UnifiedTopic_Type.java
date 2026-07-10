
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class UnifiedTopic_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnifiedTopic.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.UnifiedTopic");
 
  /** @generated */
  final Feature casFeat_Topics;
  /** @generated */
  final int     casFeatCode_Topics;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTopics(int addr) {
        if (featOkTst && casFeat_Topics == null)
      jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    return ll_cas.ll_getRefValue(addr, casFeatCode_Topics);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTopics(int addr, int v) {
        if (featOkTst && casFeat_Topics == null)
      jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    ll_cas.ll_setRefValue(addr, casFeatCode_Topics, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getTopics(int addr, int i) {
        if (featOkTst && casFeat_Topics == null)
      jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Topics), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Topics), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Topics), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setTopics(int addr, int i, int v) {
        if (featOkTst && casFeat_Topics == null)
      jcas.throwFeatMissing("Topics", "org.texttechnologylab.annotation.UnifiedTopic");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Topics), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_Topics), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_Topics), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_metadata;
  /** @generated */
  final int     casFeatCode_metadata;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getMetadata(int addr) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.UnifiedTopic");
    return ll_cas.ll_getRefValue(addr, casFeatCode_metadata);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMetadata(int addr, int v) {
        if (featOkTst && casFeat_metadata == null)
      jcas.throwFeatMissing("metadata", "org.texttechnologylab.annotation.UnifiedTopic");
    ll_cas.ll_setRefValue(addr, casFeatCode_metadata, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public UnifiedTopic_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Topics = jcas.getRequiredFeatureDE(casType, "Topics", "uima.cas.FSArray", featOkTst);
    casFeatCode_Topics  = (null == casFeat_Topics) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Topics).getCode();

 
    casFeat_metadata = jcas.getRequiredFeatureDE(casType, "metadata", "org.texttechnologylab.annotation.model.MetaData", featOkTst);
    casFeatCode_metadata  = (null == casFeat_metadata) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_metadata).getCode();

  }
}



    