
/* First created by JCasGen Tue Feb 16 16:49:46 CET 2021 */
package org.texttechnologylab.annotation.administration;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Jan 20 19:11:52 CET 2023
 * @generated */
public class AnnotationStatus_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationStatus.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.texttechnologylab.annotation.administration.AnnotationStatus");
 
  /** @generated */
  final Feature casFeat_status;
  /** @generated */
  final int     casFeatCode_status;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getStatus(int addr) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    return ll_cas.ll_getStringValue(addr, casFeatCode_status);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setStatus(int addr, String v) {
        if (featOkTst && casFeat_status == null)
      jcas.throwFeatMissing("status", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    ll_cas.ll_setStringValue(addr, casFeatCode_status, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tool;
  /** @generated */
  final int     casFeatCode_tool;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getTool(int addr) {
        if (featOkTst && casFeat_tool == null)
      jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tool);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setTool(int addr, String v) {
        if (featOkTst && casFeat_tool == null)
      jcas.throwFeatMissing("tool", "org.texttechnologylab.annotation.administration.AnnotationStatus");
    ll_cas.ll_setStringValue(addr, casFeatCode_tool, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public AnnotationStatus_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_status = jcas.getRequiredFeatureDE(casType, "status", "uima.cas.String", featOkTst);
    casFeatCode_status  = (null == casFeat_status) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_status).getCode();

 
    casFeat_tool = jcas.getRequiredFeatureDE(casType, "tool", "uima.cas.String", featOkTst);
    casFeatCode_tool  = (null == casFeat_tool) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tool).getCode();

  }
}



    