
/* First created by JCasGen Tue Mar 24 15:23:34 CET 2020 */
package org.texttechnologylab.annotation.semaf.IsoSpatial;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Wed Apr 01 13:38:51 CEST 2020
 * @generated */
public class Vec3_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Vec3.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
 
  /** @generated */
  final Feature casFeat_x;
  /** @generated */
  final int     casFeatCode_x;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getX(int addr) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_x);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setX(int addr, double v) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_x, v);}
    
  
 
  /** @generated */
  final Feature casFeat_y;
  /** @generated */
  final int     casFeatCode_y;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getY(int addr) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_y);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setY(int addr, double v) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_y, v);}
    
  
 
  /** @generated */
  final Feature casFeat_z;
  /** @generated */
  final int     casFeatCode_z;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getZ(int addr) {
        if (featOkTst && casFeat_z == null)
      jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_z);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setZ(int addr, double v) {
        if (featOkTst && casFeat_z == null)
      jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_z, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Vec3_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.Double", featOkTst);
    casFeatCode_x  = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_x).getCode();

 
    casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.Double", featOkTst);
    casFeatCode_y  = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_y).getCode();

 
    casFeat_z = jcas.getRequiredFeatureDE(casType, "z", "uima.cas.Double", featOkTst);
    casFeatCode_z  = (null == casFeat_z) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_z).getCode();

  }
}



    