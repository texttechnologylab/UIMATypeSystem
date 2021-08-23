
/* First created by JCasGen Mon Aug 23 15:20:30 CEST 2021 */
package org.texttechnologylab.annotation.semaf.isobase;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Aug 23 15:20:30 CEST 2021
 * @generated */
public class Entity_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Entity.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.semaf.isobase.Entity");
 
  /** @generated */
  final Feature casFeat_comment;
  /** @generated */
  final int     casFeatCode_comment;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getComment(int addr) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  
 
  /** @generated */
  final Feature casFeat_mod;
  /** @generated */
  final int     casFeatCode_mod;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMod(int addr) {
        if (featOkTst && casFeat_mod == null)
      jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_mod);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMod(int addr, String v) {
        if (featOkTst && casFeat_mod == null)
      jcas.throwFeatMissing("mod", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_mod, v);}
    
  
 
  /** @generated */
  final Feature casFeat_object_id;
  /** @generated */
  final int     casFeatCode_object_id;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getObject_id(int addr) {
        if (featOkTst && casFeat_object_id == null)
      jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getStringValue(addr, casFeatCode_object_id);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObject_id(int addr, String v) {
        if (featOkTst && casFeat_object_id == null)
      jcas.throwFeatMissing("object_id", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setStringValue(addr, casFeatCode_object_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_position;
  /** @generated */
  final int     casFeatCode_position;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPosition(int addr) {
        if (featOkTst && casFeat_position == null)
      jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_position);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPosition(int addr, int v) {
        if (featOkTst && casFeat_position == null)
      jcas.throwFeatMissing("position", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_position, v);}
    
  
 
  /** @generated */
  final Feature casFeat_rotation;
  /** @generated */
  final int     casFeatCode_rotation;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getRotation(int addr) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRotation(int addr, int v) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_rotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scale;
  /** @generated */
  final int     casFeatCode_scale;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getScale(int addr) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_scale);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScale(int addr, int v) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_scale, v);}
    
  
 
  /** @generated */
  final Feature casFeat_object_feature;
  /** @generated */
  final int     casFeatCode_object_feature;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getObject_feature(int addr) {
        if (featOkTst && casFeat_object_feature == null)
      jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_object_feature);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObject_feature(int addr, int v) {
        if (featOkTst && casFeat_object_feature == null)
      jcas.throwFeatMissing("object_feature", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_object_feature, v);}
    
  
 
  /** @generated */
  final Feature casFeat_object_feature_array;
  /** @generated */
  final int     casFeatCode_object_feature_array;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getObject_feature_array(int addr) {
        if (featOkTst && casFeat_object_feature_array == null)
      jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    return ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObject_feature_array(int addr, int v) {
        if (featOkTst && casFeat_object_feature_array == null)
      jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    ll_cas.ll_setRefValue(addr, casFeatCode_object_feature_array, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getObject_feature_array(int addr, int i) {
        if (featOkTst && casFeat_object_feature_array == null)
      jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setObject_feature_array(int addr, int i, int v) {
        if (featOkTst && casFeat_object_feature_array == null)
      jcas.throwFeatMissing("object_feature_array", "org.texttechnologylab.annotation.semaf.isobase.Entity");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_object_feature_array), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Entity_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

 
    casFeat_mod = jcas.getRequiredFeatureDE(casType, "mod", "uima.cas.String", featOkTst);
    casFeatCode_mod  = (null == casFeat_mod) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_mod).getCode();

 
    casFeat_object_id = jcas.getRequiredFeatureDE(casType, "object_id", "uima.cas.String", featOkTst);
    casFeatCode_object_id  = (null == casFeat_object_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_object_id).getCode();

 
    casFeat_position = jcas.getRequiredFeatureDE(casType, "position", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3", featOkTst);
    casFeatCode_position  = (null == casFeat_position) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_position).getCode();

 
    casFeat_rotation = jcas.getRequiredFeatureDE(casType, "rotation", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec4", featOkTst);
    casFeatCode_rotation  = (null == casFeat_rotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rotation).getCode();

 
    casFeat_scale = jcas.getRequiredFeatureDE(casType, "scale", "org.texttechnologylab.annotation.semaf.IsoSpatial.Vec3", featOkTst);
    casFeatCode_scale  = (null == casFeat_scale) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scale).getCode();

 
    casFeat_object_feature = jcas.getRequiredFeatureDE(casType, "object_feature", "uima.cas.FSList", featOkTst);
    casFeatCode_object_feature  = (null == casFeat_object_feature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_object_feature).getCode();

 
    casFeat_object_feature_array = jcas.getRequiredFeatureDE(casType, "object_feature_array", "uima.cas.FSArray", featOkTst);
    casFeatCode_object_feature_array  = (null == casFeat_object_feature_array) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_object_feature_array).getCode();

  }
}



    