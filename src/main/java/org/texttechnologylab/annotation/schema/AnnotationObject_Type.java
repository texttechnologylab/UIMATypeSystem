
/* First created by JCasGen Tue Oct 05 17:20:02 CEST 2021 */
package org.texttechnologylab.annotation.schema;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 05 17:20:02 CEST 2021
 * @generated */
public class AnnotationObject_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationObject.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.schema.AnnotationObject");
 
  /** @generated */
  final Feature casFeat_annotationType;
  /** @generated */
  final int     casFeatCode_annotationType;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getAnnotationType(int addr) {
        if (featOkTst && casFeat_annotationType == null)
      jcas.throwFeatMissing("annotationType", "org.texttechnologylab.annotation.schema.AnnotationObject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_annotationType);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAnnotationType(int addr, int v) {
        if (featOkTst && casFeat_annotationType == null)
      jcas.throwFeatMissing("annotationType", "org.texttechnologylab.annotation.schema.AnnotationObject");
    ll_cas.ll_setRefValue(addr, casFeatCode_annotationType, v);}
    
  
 
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
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.schema.AnnotationObject");
    return ll_cas.ll_getStringValue(addr, casFeatCode_comment);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setComment(int addr, String v) {
        if (featOkTst && casFeat_comment == null)
      jcas.throwFeatMissing("comment", "org.texttechnologylab.annotation.schema.AnnotationObject");
    ll_cas.ll_setStringValue(addr, casFeatCode_comment, v);}
    
  
 
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
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationObject");
    return ll_cas.ll_getRefValue(addr, casFeatCode_attributes);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setAttributes(int addr, int v) {
        if (featOkTst && casFeat_attributes == null)
      jcas.throwFeatMissing("attributes", "org.texttechnologylab.annotation.schema.AnnotationObject");
    ll_cas.ll_setRefValue(addr, casFeatCode_attributes, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotationObject_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_annotationType = jcas.getRequiredFeatureDE(casType, "annotationType", "org.texttechnologylab.annotation.schema.AnnotationClass", featOkTst);
    casFeatCode_annotationType  = (null == casFeat_annotationType) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_annotationType).getCode();

 
    casFeat_comment = jcas.getRequiredFeatureDE(casType, "comment", "uima.cas.String", featOkTst);
    casFeatCode_comment  = (null == casFeat_comment) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_comment).getCode();

 
    casFeat_attributes = jcas.getRequiredFeatureDE(casType, "attributes", "uima.cas.FSList", featOkTst);
    casFeatCode_attributes  = (null == casFeat_attributes) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_attributes).getCode();

  }
}



    