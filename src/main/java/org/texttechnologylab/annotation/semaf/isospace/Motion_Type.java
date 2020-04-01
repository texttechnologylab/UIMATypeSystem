
/* First created by JCasGen Tue Mar 24 15:23:19 CET 2020 */
package org.texttechnologylab.annotation.semaf.isospace;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isobase.Event_Type;

/** 
 * Updated by JCasGen Wed Apr 01 09:53:21 CEST 2020
 * @generated */
public class Motion_Type extends Event_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Motion.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isospace.Motion");
 
  /** @generated */
  final Feature casFeat_motion_type;
  /** @generated */
  final int     casFeatCode_motion_type;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMotion_type(int addr) {
        if (featOkTst && casFeat_motion_type == null)
      jcas.throwFeatMissing("motion_type", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return ll_cas.ll_getStringValue(addr, casFeatCode_motion_type);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMotion_type(int addr, String v) {
        if (featOkTst && casFeat_motion_type == null)
      jcas.throwFeatMissing("motion_type", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    ll_cas.ll_setStringValue(addr, casFeatCode_motion_type, v);}
    
  
 
  /** @generated */
  final Feature casFeat_motion_class;
  /** @generated */
  final int     casFeatCode_motion_class;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMotion_class(int addr) {
        if (featOkTst && casFeat_motion_class == null)
      jcas.throwFeatMissing("motion_class", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return ll_cas.ll_getStringValue(addr, casFeatCode_motion_class);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMotion_class(int addr, String v) {
        if (featOkTst && casFeat_motion_class == null)
      jcas.throwFeatMissing("motion_class", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    ll_cas.ll_setStringValue(addr, casFeatCode_motion_class, v);}
    
  
 
  /** @generated */
  final Feature casFeat_motion_sense;
  /** @generated */
  final int     casFeatCode_motion_sense;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMotion_sense(int addr) {
        if (featOkTst && casFeat_motion_sense == null)
      jcas.throwFeatMissing("motion_sense", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return ll_cas.ll_getStringValue(addr, casFeatCode_motion_sense);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMotion_sense(int addr, String v) {
        if (featOkTst && casFeat_motion_sense == null)
      jcas.throwFeatMissing("motion_sense", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    ll_cas.ll_setStringValue(addr, casFeatCode_motion_sense, v);}
    
  
 
  /** @generated */
  final Feature casFeat_manner;
  /** @generated */
  final int     casFeatCode_manner;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getManner(int addr) {
        if (featOkTst && casFeat_manner == null)
      jcas.throwFeatMissing("manner", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    return ll_cas.ll_getRefValue(addr, casFeatCode_manner);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setManner(int addr, int v) {
        if (featOkTst && casFeat_manner == null)
      jcas.throwFeatMissing("manner", "org.texttechnologylab.annotation.semaf.isospace.Motion");
    ll_cas.ll_setRefValue(addr, casFeatCode_manner, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Motion_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_motion_type = jcas.getRequiredFeatureDE(casType, "motion_type", "uima.cas.String", featOkTst);
    casFeatCode_motion_type  = (null == casFeat_motion_type) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_motion_type).getCode();

 
    casFeat_motion_class = jcas.getRequiredFeatureDE(casType, "motion_class", "uima.cas.String", featOkTst);
    casFeatCode_motion_class  = (null == casFeat_motion_class) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_motion_class).getCode();

 
    casFeat_motion_sense = jcas.getRequiredFeatureDE(casType, "motion_sense", "uima.cas.String", featOkTst);
    casFeatCode_motion_sense  = (null == casFeat_motion_sense) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_motion_sense).getCode();

 
    casFeat_manner = jcas.getRequiredFeatureDE(casType, "manner", "org.texttechnologylab.annotation.semaf.isobase.Entity", featOkTst);
    casFeatCode_manner  = (null == casFeat_manner) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_manner).getCode();

  }
}



    