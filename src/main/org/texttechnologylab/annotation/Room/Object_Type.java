
/* First created by JCasGen Wed Dec 02 17:56:07 CET 2020 */
package org.texttechnologylab.annotation.Room;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** Can be a single object or a group of objects
 * Updated by JCasGen Wed Dec 02 17:56:07 CET 2020
 * @generated */
public class Object_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Object.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.Room.Object");
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_fatherObject;
  /** @generated */
  final int     casFeatCode_fatherObject;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getFatherObject(int addr) {
        if (featOkTst && casFeat_fatherObject == null)
      jcas.throwFeatMissing("fatherObject", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_fatherObject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setFatherObject(int addr, int v) {
        if (featOkTst && casFeat_fatherObject == null)
      jcas.throwFeatMissing("fatherObject", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_fatherObject, v);}
    
  
 
  /** @generated */
  final Feature casFeat_nextTimeObject;
  /** @generated */
  final int     casFeatCode_nextTimeObject;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getNextTimeObject(int addr) {
        if (featOkTst && casFeat_nextTimeObject == null)
      jcas.throwFeatMissing("nextTimeObject", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_nextTimeObject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setNextTimeObject(int addr, int v) {
        if (featOkTst && casFeat_nextTimeObject == null)
      jcas.throwFeatMissing("nextTimeObject", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_nextTimeObject, v);}
    
  
 
  /** @generated */
  final Feature casFeat_prevTimeObject;
  /** @generated */
  final int     casFeatCode_prevTimeObject;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getPrevTimeObject(int addr) {
        if (featOkTst && casFeat_prevTimeObject == null)
      jcas.throwFeatMissing("prevTimeObject", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_prevTimeObject);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrevTimeObject(int addr, int v) {
        if (featOkTst && casFeat_prevTimeObject == null)
      jcas.throwFeatMissing("prevTimeObject", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_prevTimeObject, v);}
    
  
 
  /** @generated */
  final Feature casFeat_timeReference;
  /** @generated */
  final int     casFeatCode_timeReference;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getTimeReference(int addr) {
        if (featOkTst && casFeat_timeReference == null)
      jcas.throwFeatMissing("timeReference", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_timeReference);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTimeReference(int addr, int v) {
        if (featOkTst && casFeat_timeReference == null)
      jcas.throwFeatMissing("timeReference", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_timeReference, v);}
    
  
 
  /** @generated */
  final Feature casFeat_shapeNetID;
  /** @generated */
  final int     casFeatCode_shapeNetID;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getShapeNetID(int addr) {
        if (featOkTst && casFeat_shapeNetID == null)
      jcas.throwFeatMissing("shapeNetID", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getStringValue(addr, casFeatCode_shapeNetID);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setShapeNetID(int addr, String v) {
        if (featOkTst && casFeat_shapeNetID == null)
      jcas.throwFeatMissing("shapeNetID", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setStringValue(addr, casFeatCode_shapeNetID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_scale;
  /** @generated */
  final int     casFeatCode_scale;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getScale(int addr) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_scale);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setScale(int addr, double v) {
        if (featOkTst && casFeat_scale == null)
      jcas.throwFeatMissing("scale", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_scale, v);}
    
  
 
  /** @generated */
  final Feature casFeat_location;
  /** @generated */
  final int     casFeatCode_location;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getLocation(int addr) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_location);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLocation(int addr, int v) {
        if (featOkTst && casFeat_location == null)
      jcas.throwFeatMissing("location", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_location, v);}
    
  
 
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
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_rotation);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRotation(int addr, int v) {
        if (featOkTst && casFeat_rotation == null)
      jcas.throwFeatMissing("rotation", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_rotation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_objectFeature;
  /** @generated */
  final int     casFeatCode_objectFeature;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getObjectFeature(int addr) {
        if (featOkTst && casFeat_objectFeature == null)
      jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    return ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObjectFeature(int addr, int v) {
        if (featOkTst && casFeat_objectFeature == null)
      jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    ll_cas.ll_setRefValue(addr, casFeatCode_objectFeature, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getObjectFeature(int addr, int i) {
        if (featOkTst && casFeat_objectFeature == null)
      jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setObjectFeature(int addr, int i, int v) {
        if (featOkTst && casFeat_objectFeature == null)
      jcas.throwFeatMissing("objectFeature", "org.texttechnologylab.annotation.Room.Object");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_objectFeature), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Object_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_fatherObject = jcas.getRequiredFeatureDE(casType, "fatherObject", "org.texttechnologylab.annotation.Room.Object", featOkTst);
    casFeatCode_fatherObject  = (null == casFeat_fatherObject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_fatherObject).getCode();

 
    casFeat_nextTimeObject = jcas.getRequiredFeatureDE(casType, "nextTimeObject", "org.texttechnologylab.annotation.Room.Object", featOkTst);
    casFeatCode_nextTimeObject  = (null == casFeat_nextTimeObject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nextTimeObject).getCode();

 
    casFeat_prevTimeObject = jcas.getRequiredFeatureDE(casType, "prevTimeObject", "org.texttechnologylab.annotation.Room.Object", featOkTst);
    casFeatCode_prevTimeObject  = (null == casFeat_prevTimeObject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_prevTimeObject).getCode();

 
    casFeat_timeReference = jcas.getRequiredFeatureDE(casType, "timeReference", "org.texttechnologylab.annotation.Room.TimeChain", featOkTst);
    casFeatCode_timeReference  = (null == casFeat_timeReference) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_timeReference).getCode();

 
    casFeat_shapeNetID = jcas.getRequiredFeatureDE(casType, "shapeNetID", "uima.cas.String", featOkTst);
    casFeatCode_shapeNetID  = (null == casFeat_shapeNetID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_shapeNetID).getCode();

 
    casFeat_scale = jcas.getRequiredFeatureDE(casType, "scale", "uima.cas.Double", featOkTst);
    casFeatCode_scale  = (null == casFeat_scale) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_scale).getCode();

 
    casFeat_location = jcas.getRequiredFeatureDE(casType, "location", "org.texttechnologylab.annotation.Vector", featOkTst);
    casFeatCode_location  = (null == casFeat_location) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_location).getCode();

 
    casFeat_rotation = jcas.getRequiredFeatureDE(casType, "rotation", "org.texttechnologylab.annotation.Vector", featOkTst);
    casFeatCode_rotation  = (null == casFeat_rotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_rotation).getCode();

 
    casFeat_objectFeature = jcas.getRequiredFeatureDE(casType, "objectFeature", "uima.cas.FSArray", featOkTst);
    casFeatCode_objectFeature  = (null == casFeat_objectFeature) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_objectFeature).getCode();

  }
}



    