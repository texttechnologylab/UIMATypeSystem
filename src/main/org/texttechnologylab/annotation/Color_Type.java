
/* First created by JCasGen Wed Dec 02 17:55:22 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.type.AnnotationNode_Type;

/** 
 * Updated by JCasGen Wed Dec 02 17:55:22 CET 2020
 * @generated */
public class Color_Type extends AnnotationNode_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Color.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Color");
 
  /** @generated */
  final Feature casFeat_rgb;
  /** @generated */
  final int     casFeatCode_rgb;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getRgb(int addr) {
        if (featOkTst && casFeat_rgb == null)
      jcas.throwFeatMissing("rgb", "org.texttechnologylab.annotation.Color");
    return ll_cas.ll_getStringValue(addr, casFeatCode_rgb);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRgb(int addr, String v) {
        if (featOkTst && casFeat_rgb == null)
      jcas.throwFeatMissing("rgb", "org.texttechnologylab.annotation.Color");
    ll_cas.ll_setStringValue(addr, casFeatCode_rgb, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Color_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_rgb = jcas.getRequiredFeatureDE(casType, "rgb", "uima.cas.String", featOkTst);
    casFeatCode_rgb  = (null == casFeat_rgb) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rgb).getCode();

  }
}



    