
/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.IsoSpatial;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * @generated */
public class Vec4_Type extends Vec3_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Vec4.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4");
 
  /** @generated */
  final Feature casFeat_w;
  /** @generated */
  final int     casFeatCode_w;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getW(int addr) {
        if (featOkTst && casFeat_w == null)
      jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_w);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setW(int addr, double v) {
        if (featOkTst && casFeat_w == null)
      jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_w, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Vec4_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_w = jcas.getRequiredFeatureDE(casType, "w", "uima.cas.Double", featOkTst);
    casFeatCode_w  = (null == casFeat_w) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_w).getCode();

  }
}



    