
/* First created by JCasGen Tue Jan 09 18:13:21 CET 2024 */
package org.texttechnologylab.annotation.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Feb 28 11:04:58 CET 2024
 * @generated */
public class MultimediaElement_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MultimediaElement.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.type.MultimediaElement");
 
  /** @generated */
  final Feature casFeat_timeStart;
  /** @generated */
  final int     casFeatCode_timeStart;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getTimeStart(int addr) {
        if (featOkTst && casFeat_timeStart == null)
      jcas.throwFeatMissing("timeStart", "org.texttechnologylab.annotation.type.MultimediaElement");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_timeStart);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTimeStart(int addr, float v) {
        if (featOkTst && casFeat_timeStart == null)
      jcas.throwFeatMissing("timeStart", "org.texttechnologylab.annotation.type.MultimediaElement");
    ll_cas.ll_setFloatValue(addr, casFeatCode_timeStart, v);}
    
  
 
  /** @generated */
  final Feature casFeat_timeEnd;
  /** @generated */
  final int     casFeatCode_timeEnd;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public float getTimeEnd(int addr) {
        if (featOkTst && casFeat_timeEnd == null)
      jcas.throwFeatMissing("timeEnd", "org.texttechnologylab.annotation.type.MultimediaElement");
    return ll_cas.ll_getFloatValue(addr, casFeatCode_timeEnd);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTimeEnd(int addr, float v) {
        if (featOkTst && casFeat_timeEnd == null)
      jcas.throwFeatMissing("timeEnd", "org.texttechnologylab.annotation.type.MultimediaElement");
    ll_cas.ll_setFloatValue(addr, casFeatCode_timeEnd, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public MultimediaElement_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_timeStart = jcas.getRequiredFeatureDE(casType, "timeStart", "uima.cas.Float", featOkTst);
    casFeatCode_timeStart  = (null == casFeat_timeStart) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timeStart).getCode();

 
    casFeat_timeEnd = jcas.getRequiredFeatureDE(casType, "timeEnd", "uima.cas.Float", featOkTst);
    casFeatCode_timeEnd  = (null == casFeat_timeEnd) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timeEnd).getCode();

  }
}



    