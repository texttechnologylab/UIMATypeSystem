
/* First created by JCasGen Mon Apr 06 13:25:05 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Signal_Type;

/** 
 * Updated by JCasGen Thu Apr 23 09:56:12 CEST 2020
 * @generated */
public class MotionSignal_Type extends Signal_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MotionSignal.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.MotionSignal");
 
  /** @generated */
  final Feature casFeat_motion_signal_type;
  /** @generated */
  final int     casFeatCode_motion_signal_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMotion_signal_type(int addr) {
        if (featOkTst && casFeat_motion_signal_type == null)
      jcas.throwFeatMissing("motion_signal_type", "org.texttechnologylab.annotation.semaf.isospace.MotionSignal");
    return ll_cas.ll_getStringValue(addr, casFeatCode_motion_signal_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMotion_signal_type(int addr, String v) {
        if (featOkTst && casFeat_motion_signal_type == null)
      jcas.throwFeatMissing("motion_signal_type", "org.texttechnologylab.annotation.semaf.isospace.MotionSignal");
    ll_cas.ll_setStringValue(addr, casFeatCode_motion_signal_type, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MotionSignal_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_motion_signal_type = jcas.getRequiredFeatureDE(casType, "motion_signal_type", "uima.cas.String", featOkTst);
    casFeatCode_motion_signal_type  = (null == casFeat_motion_signal_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_motion_signal_type).getCode();

  }
}



    