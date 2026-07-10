
/* First created by JCasGen Fri Jul 10 17:01:28 CEST 2026 */
package org.texttechnologylab.annotation.parliamentary;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Fri Jul 10 17:01:28 CEST 2026
 * @generated */
public class SpeechText_Type extends SpeechSection_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = SpeechText.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.parliamentary.SpeechText");
 
  /** @generated */
  final Feature casFeat_speaker;
  /** @generated */
  final int     casFeatCode_speaker;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getSpeaker(int addr) {
        if (featOkTst && casFeat_speaker == null)
      jcas.throwFeatMissing("speaker", "org.texttechnologylab.annotation.parliamentary.SpeechText");
    return ll_cas.ll_getRefValue(addr, casFeatCode_speaker);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSpeaker(int addr, int v) {
        if (featOkTst && casFeat_speaker == null)
      jcas.throwFeatMissing("speaker", "org.texttechnologylab.annotation.parliamentary.SpeechText");
    ll_cas.ll_setRefValue(addr, casFeatCode_speaker, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public SpeechText_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_speaker = jcas.getRequiredFeatureDE(casType, "speaker", "org.texttechnologylab.annotation.parliamentary.Speaker", featOkTst);
    casFeatCode_speaker  = (null == casFeat_speaker) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_speaker).getCode();

  }
}



    