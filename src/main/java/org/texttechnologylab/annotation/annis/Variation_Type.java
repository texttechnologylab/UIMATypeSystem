
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.annis;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class Variation_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Variation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.annis.Variation");
 
  /** @generated */
  final Feature casFeat_layer;
  /** @generated */
  final int     casFeatCode_layer;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLayer(int addr) {
        if (featOkTst && casFeat_layer == null)
      jcas.throwFeatMissing("layer", "org.texttechnologylab.annotation.annis.Variation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_layer);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLayer(int addr, String v) {
        if (featOkTst && casFeat_layer == null)
      jcas.throwFeatMissing("layer", "org.texttechnologylab.annotation.annis.Variation");
    ll_cas.ll_setStringValue(addr, casFeatCode_layer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Variation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_layer = jcas.getRequiredFeatureDE(casType, "layer", "uima.cas.String", featOkTst);
    casFeatCode_layer  = (null == casFeat_layer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_layer).getCode();

  }
}



    