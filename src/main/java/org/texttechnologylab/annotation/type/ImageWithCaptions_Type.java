
/* First created by JCasGen Fri Jul 10 13:24:14 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Jul 10 13:24:14 CEST 2026
 * @generated */
public class ImageWithCaptions_Type extends Image_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = ImageWithCaptions.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.ImageWithCaptions");
 
  /** @generated */
  final Feature casFeat_captions;
  /** @generated */
  final int     casFeatCode_captions;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getCaptions(int addr) {
        if (featOkTst && casFeat_captions == null)
      jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    return ll_cas.ll_getRefValue(addr, casFeatCode_captions);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCaptions(int addr, int v) {
        if (featOkTst && casFeat_captions == null)
      jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    ll_cas.ll_setRefValue(addr, casFeatCode_captions, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getCaptions(int addr, int i) {
        if (featOkTst && casFeat_captions == null)
      jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_captions), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_captions), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_captions), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setCaptions(int addr, int i, int v) {
        if (featOkTst && casFeat_captions == null)
      jcas.throwFeatMissing("captions", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_captions), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_captions), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_captions), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_captionLanguage;
  /** @generated */
  final int     casFeatCode_captionLanguage;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getCaptionLanguage(int addr) {
        if (featOkTst && casFeat_captionLanguage == null)
      jcas.throwFeatMissing("captionLanguage", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    return ll_cas.ll_getStringValue(addr, casFeatCode_captionLanguage);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setCaptionLanguage(int addr, String v) {
        if (featOkTst && casFeat_captionLanguage == null)
      jcas.throwFeatMissing("captionLanguage", "org.texttechnologylab.annotation.type.ImageWithCaptions");
    ll_cas.ll_setStringValue(addr, casFeatCode_captionLanguage, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public ImageWithCaptions_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_captions = jcas.getRequiredFeatureDE(casType, "captions", "uima.cas.FSArray", featOkTst);
    casFeatCode_captions  = (null == casFeat_captions) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_captions).getCode();

 
    casFeat_captionLanguage = jcas.getRequiredFeatureDE(casType, "captionLanguage", "uima.cas.String", featOkTst);
    casFeatCode_captionLanguage  = (null == casFeat_captionLanguage) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_captionLanguage).getCode();

  }
}



    