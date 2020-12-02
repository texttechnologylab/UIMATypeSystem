
/* First created by JCasGen Wed Dec 02 18:39:06 CET 2020 */
package org.texttechnologylab.annotation;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Vector in a room
 * Updated by JCasGen Wed Dec 02 18:39:06 CET 2020
 * @generated */
public class Vector_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Vector.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Vector");
 
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
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.Vector");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_x);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setX(int addr, double v) {
        if (featOkTst && casFeat_x == null)
      jcas.throwFeatMissing("x", "org.texttechnologylab.annotation.Vector");
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
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.Vector");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_y);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setY(int addr, double v) {
        if (featOkTst && casFeat_y == null)
      jcas.throwFeatMissing("y", "org.texttechnologylab.annotation.Vector");
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
      jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.Vector");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_z);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setZ(int addr, double v) {
        if (featOkTst && casFeat_z == null)
      jcas.throwFeatMissing("z", "org.texttechnologylab.annotation.Vector");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_z, v);}
    
  
 
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
      jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.Vector");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_w);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setW(int addr, double v) {
        if (featOkTst && casFeat_w == null)
      jcas.throwFeatMissing("w", "org.texttechnologylab.annotation.Vector");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_w, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Vector_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_x = jcas.getRequiredFeatureDE(casType, "x", "uima.cas.Double", featOkTst);
    casFeatCode_x  = (null == casFeat_x) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_x).getCode();

 
    casFeat_y = jcas.getRequiredFeatureDE(casType, "y", "uima.cas.Double", featOkTst);
    casFeatCode_y  = (null == casFeat_y) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_y).getCode();

 
    casFeat_z = jcas.getRequiredFeatureDE(casType, "z", "uima.cas.Double", featOkTst);
    casFeatCode_z  = (null == casFeat_z) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_z).getCode();

 
    casFeat_w = jcas.getRequiredFeatureDE(casType, "w", "uima.cas.Double", featOkTst);
    casFeatCode_w  = (null == casFeat_w) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_w).getCode();

  }
}



    