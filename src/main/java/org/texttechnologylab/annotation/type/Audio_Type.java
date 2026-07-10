
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** This represent an audio in base64
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class Audio_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Audio.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.Audio");
 
  /** @generated */
  final Feature casFeat_src;
  /** @generated */
  final int     casFeatCode_src;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSrc(int addr) {
        if (featOkTst && casFeat_src == null)
      jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Audio");
    return ll_cas.ll_getStringValue(addr, casFeatCode_src);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSrc(int addr, String v) {
        if (featOkTst && casFeat_src == null)
      jcas.throwFeatMissing("src", "org.texttechnologylab.annotation.type.Audio");
    ll_cas.ll_setStringValue(addr, casFeatCode_src, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mimetype;
  /** @generated */
  final int     casFeatCode_mimetype;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMimetype(int addr) {
        if (featOkTst && casFeat_mimetype == null)
      jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Audio");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mimetype);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMimetype(int addr, String v) {
        if (featOkTst && casFeat_mimetype == null)
      jcas.throwFeatMissing("mimetype", "org.texttechnologylab.annotation.type.Audio");
    ll_cas.ll_setStringValue(addr, casFeatCode_mimetype, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Audio_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_src = jcas.getRequiredFeatureDE(casType, "src", "uima.cas.String", featOkTst);
    casFeatCode_src  = (null == casFeat_src) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_src).getCode();

 
    casFeat_mimetype = jcas.getRequiredFeatureDE(casType, "mimetype", "uima.cas.String", featOkTst);
    casFeatCode_mimetype  = (null == casFeat_mimetype) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mimetype).getCode();

  }
}



    