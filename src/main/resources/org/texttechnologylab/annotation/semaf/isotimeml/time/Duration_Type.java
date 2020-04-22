
/* First created by JCasGen Tue Apr 07 19:23:28 CEST 2020 */
package org.texttechnologylab.annotation.semaf.isotimeml.time;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.texttechnologylab.annotation.semaf.isotimeml.TimeX3_Type;

/** 
 * Updated by JCasGen Tue Apr 07 19:23:30 CEST 2020
 * @generated */
public class Duration_Type extends TimeX3_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Duration.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
 
  /** @generated */
  final Feature casFeat_beginPoint;
  /** @generated */
  final int     casFeatCode_beginPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBeginPoint(int addr) {
        if (featOkTst && casFeat_beginPoint == null)
      jcas.throwFeatMissing("beginPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    return ll_cas.ll_getRefValue(addr, casFeatCode_beginPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBeginPoint(int addr, int v) {
        if (featOkTst && casFeat_beginPoint == null)
      jcas.throwFeatMissing("beginPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    ll_cas.ll_setRefValue(addr, casFeatCode_beginPoint, v);}
    
  
 
  /** @generated */
  final Feature casFeat_endPoint;
  /** @generated */
  final int     casFeatCode_endPoint;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEndPoint(int addr) {
        if (featOkTst && casFeat_endPoint == null)
      jcas.throwFeatMissing("endPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    return ll_cas.ll_getRefValue(addr, casFeatCode_endPoint);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEndPoint(int addr, int v) {
        if (featOkTst && casFeat_endPoint == null)
      jcas.throwFeatMissing("endPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Duration");
    ll_cas.ll_setRefValue(addr, casFeatCode_endPoint, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Duration_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_beginPoint = jcas.getRequiredFeatureDE(casType, "beginPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Date", featOkTst);
    casFeatCode_beginPoint  = (null == casFeat_beginPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginPoint).getCode();

 
    casFeat_endPoint = jcas.getRequiredFeatureDE(casType, "endPoint", "org.texttechnologylab.annotation.semaf.isotimeml.time.Date", featOkTst);
    casFeatCode_endPoint  = (null == casFeat_endPoint) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_endPoint).getCode();

  }
}



    