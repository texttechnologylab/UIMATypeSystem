
/* First created by JCasGen Thu Dec 21 13:46:41 CET 2023 */
package org.texttechnologylab.uima.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.ModelAnnotation_Type;

/** 
 * Updated by JCasGen Thu Dec 21 13:46:41 CET 2023
 * @generated */
public class Embedding_Type extends ModelAnnotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Embedding.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.uima.type.Embedding");
 
  /** @generated */
  final Feature casFeat_embedding;
  /** @generated */
  final int     casFeatCode_embedding;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEmbedding(int addr) {
        if (featOkTst && casFeat_embedding == null)
      jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    return ll_cas.ll_getRefValue(addr, casFeatCode_embedding);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEmbedding(int addr, int v) {
        if (featOkTst && casFeat_embedding == null)
      jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    ll_cas.ll_setRefValue(addr, casFeatCode_embedding, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public float getEmbedding(int addr, int i) {
        if (featOkTst && casFeat_embedding == null)
      jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_embedding), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_embedding), i);
	return ll_cas.ll_getFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_embedding), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setEmbedding(int addr, int i, float v) {
        if (featOkTst && casFeat_embedding == null)
      jcas.throwFeatMissing("embedding", "org.texttechnologylab.uima.type.Embedding");
    if (lowLevelTypeChecks)
      ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_embedding), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_embedding), i);
    ll_cas.ll_setFloatArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_embedding), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Embedding_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_embedding = jcas.getRequiredFeatureDE(casType, "embedding", "uima.cas.FloatArray", featOkTst);
    casFeatCode_embedding  = (null == casFeat_embedding) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_embedding).getCode();

  }
}



    