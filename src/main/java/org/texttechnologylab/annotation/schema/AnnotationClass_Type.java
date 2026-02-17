
/* First created by JCasGen Tue Feb 17 20:19:37 CET 2026 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** 
 * Updated by JCasGen Tue Feb 17 20:19:37 CET 2026
 * @generated */
public class AnnotationClass_Type extends AnnotationBase_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationClass.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.schema.AnnotationClass");
 
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
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.AnnotationClass");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "org.texttechnologylab.annotation.schema.AnnotationClass");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_description;
  /** @generated */
  final int     casFeatCode_description;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getDescription(int addr) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.AnnotationClass");
    return ll_cas.ll_getStringValue(addr, casFeatCode_description);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setDescription(int addr, String v) {
        if (featOkTst && casFeat_description == null)
      jcas.throwFeatMissing("description", "org.texttechnologylab.annotation.schema.AnnotationClass");
    ll_cas.ll_setStringValue(addr, casFeatCode_description, v);}
    
  
 
  /** @generated */
  final Feature casFeat_attributes;
  /** @generated */
  final int     casFeatCode_attributes;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAttributes(int addr) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationClass");
    return ll_cas.ll_getRefValue(addr, casFeatCode_attributes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttributes(int addr, int v) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationClass");
    ll_cas.ll_setRefValue(addr, casFeatCode_attributes, v);}
    
   /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @return value at index i in the array 
   */
  public int getAttributes(int addr, int i) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationClass");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i);
	return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i);
  }
   
  /** @generated
   * @param addr low level Feature Structure reference
   * @param i index of item in the array
   * @param v value to set
   */ 
  public void setAttributes(int addr, int i, int v) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationClass");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_attributes), i, v);
  }
 



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotationClass_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_description = jcas.getRequiredFeatureDE(casType, "description", "uima.cas.String", featOkTst);
    casFeatCode_description  = (null == casFeat_description) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_description).getCode();

 
    casFeat_attributes = jcas.getRequiredFeatureDE(casType, "attributes", "uima.cas.FSArray", featOkTst);
    casFeatCode_attributes  = (null == casFeat_attributes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attributes).getCode();

  }
}



    