
/* First created by JCasGen Thu Apr 23 09:55:34 CEST 2020 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Roomwall
 * Updated by JCasGen Thu Apr 23 09:55:34 CEST 2020
 * @generated */
public class RoomWall_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RoomWall.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Room.RoomWall");
 
  /** @generated */
  final Feature casFeat_vectorlist;
  /** @generated */
  final int     casFeatCode_vectorlist;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getVectorlist(int addr) {
        if (featOkTst && casFeat_vectorlist == null)
      jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    return ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setVectorlist(int addr, int v) {
        if (featOkTst && casFeat_vectorlist == null)
      jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    ll_cas.ll_setRefValue(addr, casFeatCode_vectorlist, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getVectorlist(int addr, int i) {
        if (featOkTst && casFeat_vectorlist == null)
      jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setVectorlist(int addr, int i, int v) {
        if (featOkTst && casFeat_vectorlist == null)
      jcas.throwFeatMissing("vectorlist", "org.texttechnologylab.annotation.Room.RoomWall");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_vectorlist), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_height;
  /** @generated */
  final int     casFeatCode_height;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getHeight(int addr) {
        if (featOkTst && casFeat_height == null)
      jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.Room.RoomWall");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_height);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setHeight(int addr, double v) {
        if (featOkTst && casFeat_height == null)
      jcas.throwFeatMissing("height", "org.texttechnologylab.annotation.Room.RoomWall");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_height, v);}
    
  
 
  /** @generated */
  final Feature casFeat_feature;
  /** @generated */
  final int     casFeatCode_feature;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFeature(int addr) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    return ll_cas.ll_getRefValue(addr, casFeatCode_feature);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFeature(int addr, int v) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    ll_cas.ll_setRefValue(addr, casFeatCode_feature, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getFeature(int addr, int i) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setFeature(int addr, int i, int v) {
        if (featOkTst && casFeat_feature == null)
      jcas.throwFeatMissing("feature", "org.texttechnologylab.annotation.Room.RoomWall");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_feature), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public RoomWall_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_vectorlist = jcas.getRequiredFeatureDE(casType, "vectorlist", "uima.cas.FSArray", featOkTst);
    casFeatCode_vectorlist  = (null == casFeat_vectorlist) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_vectorlist).getCode();

 
    casFeat_height = jcas.getRequiredFeatureDE(casType, "height", "uima.cas.Double", featOkTst);
    casFeatCode_height  = (null == casFeat_height) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_height).getCode();

 
    casFeat_feature = jcas.getRequiredFeatureDE(casType, "feature", "uima.cas.FSArray", featOkTst);
    casFeatCode_feature  = (null == casFeat_feature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_feature).getCode();

  }
}



    