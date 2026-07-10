
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** Annotation type for recognized taxon mentions.
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class RecognizedTaxon_Type extends Taxon_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RecognizedTaxon.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.RecognizedTaxon");
 
  /** @generated */
  final Feature casFeat_resolutions;
  /** @generated */
  final int     casFeatCode_resolutions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getResolutions(int addr) {
        if (featOkTst && casFeat_resolutions == null)
      jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    return ll_cas.ll_getRefValue(addr, casFeatCode_resolutions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setResolutions(int addr, int v) {
        if (featOkTst && casFeat_resolutions == null)
      jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    ll_cas.ll_setRefValue(addr, casFeatCode_resolutions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getResolutions(int addr, int i) {
        if (featOkTst && casFeat_resolutions == null)
      jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resolutions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_resolutions), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resolutions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setResolutions(int addr, int i, int v) {
        if (featOkTst && casFeat_resolutions == null)
      jcas.throwFeatMissing("resolutions", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resolutions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_resolutions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_resolutions), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_text;
  /** @generated */
  final int     casFeatCode_text;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getText(int addr) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    return ll_cas.ll_getStringValue(addr, casFeatCode_text);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setText(int addr, String v) {
        if (featOkTst && casFeat_text == null)
      jcas.throwFeatMissing("text", "org.texttechnologylab.annotation.type.RecognizedTaxon");
    ll_cas.ll_setStringValue(addr, casFeatCode_text, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RecognizedTaxon_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_resolutions = jcas.getRequiredFeatureDE(casType, "resolutions", "uima.cas.FSArray", featOkTst);
    casFeatCode_resolutions  = (null == casFeat_resolutions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_resolutions).getCode();

 
    casFeat_text = jcas.getRequiredFeatureDE(casType, "text", "uima.cas.String", featOkTst);
    casFeatCode_text  = (null == casFeat_text) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_text).getCode();

  }
}



    